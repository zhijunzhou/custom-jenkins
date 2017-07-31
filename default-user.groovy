import jenkins.model.*
import hudson.security.*

def env = System.getenv()
def instance = Jenkins.getInstance()
def hudsonRealm = new HudsonPrivateSecurityRealm(false)
def strategy = new FullControlOnceLoggedInAuthorizationStrategy()

println "--> creating local user 'admin'"

hudsonRealm.createAccount(env.JENKINS_USER, env.JENKINS_PASS)
instance.setSecurityRealm(hudsonRealm)
strategy.setAllowAnonymousRead(false)
instance.setAuthorizationStrategy(strategy)

instance.getAuthorizationStrategy().add(Jenkins.ADMINISTER, env.JENKINS_USER)
instance.save()