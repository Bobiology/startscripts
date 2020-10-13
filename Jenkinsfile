/*
node{

stage("Checkout"){
  echo "cheking out the code"
  git 'https://github.com/simkazw/startscripts.git'
<<<<<<< HEAD
  //sh '/opt/Programs/maven/apache-maven-3.6.3/bin/mvn -Dmaven.test.failure.ignore=true clean package'
  sh '/opt/Programs/maven/apache-maven-3.6.3/bin/mvn clean install'
=======
>>>>>>> 6dc776d614f34fc7bbd19100599f8690338759df
}

stage("Build"){
  echo "building the code"
  //sh "mvn -Dmaven.test.failure.ignore=true clean package"
  sh 'mvn clean install'
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
*/

node{
stage("Checkout"){
  echo "cheking out the code"
  git 'https://github.com/Bobiology/startscripts.git'
}

 

stage("Build"){
  echo "building the code"
  //sh "mvn -Dmaven.test.failure.ignore=true clean package"
  sh '/Users/Shared/SOFTWARE/RUNNING/apache-maven-3.6.3/bin/mvn clean install'
}
  stage('SonarQube analysis') {
    def mvnHome = tool name: 'MAVEN_HOME', type: 'maven'
    withSonarQubeEnv('SonarQube'){
      sh "${mvnHome}/bin/mvn sonar:sonar"
    }
    /*timeout(time: 3, unit: 'MINUTES') {
            waitForQualityGate abortPipeline: false
        }*/
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
 
