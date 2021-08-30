def call(Map params){  
        sshagent(['"${params.server}"']) {
          sh "sudo docker -h StrictHostKeyChecking=no ubuntu@172.31.11.14 run -d -p 3000:3001 --network=Bridge --name ordermanagementcontainer atuljain1383/ordermanagement:v4"
    }
}
