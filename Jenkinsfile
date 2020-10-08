node{
stage("Checkout"){
  echo "cheking out the code"
   steps {
                // Get some code from a GitHub repository
                git 'https://github.com/simkazw/startscripts.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
}

stage("Build"){
  echo "building the code"
}

stage("CodeQualityAndCoverage"){
  echo "cheking code quality and coverage"
}

stage("AUtomatedTesting"){
  echo "automated code testing"
}

stage("PreRequisiteCheck"){
  echo "cheking required document"
}

stage("UATDeployment"){
  echo "deploying in UAT"
}


}
