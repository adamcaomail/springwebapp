pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                echo "--------------start build------------"
                sh "rm -rf SpringApp"
                sh "rm SpringApp.war"
                echo "the workspace is cleaned"
                sh "mvn clean install"
                echo "---------------build finished--------------------"
            }
            
        }
        stage("deploy"){
            steps{
                echo "start push to tomcat container"
                deploy adapters: [tomcat9(credentialsId: 'c4482657-4c2e-44f6-8249-eb091f87128a', path: '', url: 'http://localhost:8080/')], contextPath: 'SpringApp', onFailure: false, war: '**/*.war'
            }
        }
    }

}