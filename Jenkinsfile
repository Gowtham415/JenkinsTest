pipeline{
    agent any
    stages{
        stage('Build'){
        steps{
            echo "Hello, Building the application"
            build 'Build'
        }
    }
        stage('Test'){
            steps{
                echo "Hello, Testing the application"
                build 'SeleniumTest'
            }
        }
        stage('Deploy'){
            steps{
                echo "Hello, Deploying the application"
                build 'Deploy'
            }
        }
    }
}
