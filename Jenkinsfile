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
                deploy adapters: [tomcat9(credentialsId: 'dcf32b2e-8798-4d1c-8b0a-ca671ef90087', path: '', url: 'http://localhost:8080/')], contextPath: 'SpringApp', onFailure: false, war: '**/*.war'
            }
        }
    }

}