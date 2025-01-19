@NonCPS
def modules() {
	def  directories = [
		"sysgine-framework-test",
		"sysgine-framework-common",
		"sysgine-framework-reflection"
	]
	directories
}

pipeline {
	agent any

	tools {
		maven "maven3"
		jdk "openjdk21"
	}

    options {
        timeout(time: 15, unit: 'MINUTES')
    }

	stages {
        stage('Initialization') {
            steps {
                echo "Building Branch: ${env.BRANCH_NAME}"
                echo "Using PATH = ${env.PATH}"
				echo "M2_HOME = ${M2_HOME}"
				echo "JAVA_HOME = ${JAVA_HOME}"
				sh "java -version"
				sh "javac -version"
				sh "mvn -version"
            }
        }

		stage('Checkout') {
			steps {
				git branch: "${env.BRANCH_NAME}", url: "${env.GIT_URL}"
			}
		}

		stage('Build BOM') {
			steps {
                dir("${env.WORKSPACE}/sysgine-framework-bom") {
                    sh "mvn clean install"
                }
			}
		}

		stage('Build Framework') {
			steps {
                sh "mvn clean package -Dmaven.test.skip=true -e"
			}
		}

		stage('Test') {
			steps {
                sh "mvn test -Dmaven.test.redirectTestOutputToFile=true -e"
			}
		}
	}
}
