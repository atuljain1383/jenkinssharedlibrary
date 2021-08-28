def call(Map params){  
    sh "sudo docker login -u ${params.username} -p ${params.password}"
    sh 'sudo docker push ${params.imagename}'
}
