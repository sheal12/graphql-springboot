pipeline {
    agent any
    // golbal env
    environment {
        name ='shailendra'
    }
    
    parameters{
        string(name:'person',defaultValue:'shael', description:'who are you ?')
        booleanParam(name:'isMale',defaultValue:true, description:'who are you ?')
        choice(name:'city',choices:['jaipur','delhi','bangkok'], description:'who are you ?')
    }

    stages {
        stage('test') {
            steps {
                echo 'Hello World'
                echo 'saaa'
            }
        }
        stage('environment') {
            environment {
                username ='shailendra'
            }
            steps {
                echo 'Hello World'
                echo "${name}"
                echo "${username}"
            }
        }
        stage('parameters') {
            steps {
                echo 'Hello World'
                echo "${person}"

            }

        }
        stage('manual trigger build') {
            input{
                message "Press Ok to continue"
                ok "Yes we should"
            }
            steps {
                echo 'Hello World'
            }
        }
    }
    post {
        always {
            echo 'always we should continue with hello'
        }
        
         failure {
            echo 'failure'
        }
        
         success {
            echo 'success'
        }
    }
}
