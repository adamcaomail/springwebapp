pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                echo "--------------start build------------"
                sh "mvn clean install"
                echo "---------------build finished--------------------"
            }
            
        }
        stage("deploy"){
            steps{
                echo "start push to tomcat container"
            }
        }
    }

}