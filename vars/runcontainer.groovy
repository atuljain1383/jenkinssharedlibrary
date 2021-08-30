def call(Map params){  
        sshagent(['"${params.server}"']) {
          sh "ssh -o StrictHostKeyChecking=no ubuntu@13.235.76.102 sudo docker run -p 3000:3001 --network=Bridge --name ordermanagementcontainer atuljain1383/ordermanagement:v4"
    }
}
