node{
stage("Checkout"){
  echo "cheking out the code"
  git 'https://github.com/simkazw/startscripts.git'
}

stage("Build"){
  echo "building the code"
  //sh "mvn -Dmaven.test.failure.ignore=true clean package"
  sh '/opt/Programs/maven/apache-maven-3.6.3/bin/mvn clean install'
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
