def call(Map params){  
    script {
        sshagent(["${params.server}"]) {
          echo "ssh -o StrictHostKeyChecking=no ubuntu@13.233.133.253 sudo docker run -d -p 3000:3001 --network=Bridge --name ordermanagementcontainer atuljain1383/ordermanagement:v4"
        }
    }
}
