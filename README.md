# cutomer-reward-program using Java and Spring boot.

There are two API methods Post and Get

Post method is to create the customer rewards data 

example for Post body for testint : 
http://localhost:XXXX/customer-rewards

[{"id":"65654","name":"jack","transactionAmount": 396.60 },
{"id":"9384","name":"bob","transactionAmount": 96.60 },
{"id":"1233","name":"snehith","transactionAmount": 196.60 },
{"id":"34232","name":"sakkari","transactionAmount": 296.60 }
]

Get method is to get the average reward points according to the criteria
 example for get request and result:
 
 http://localhost:XXXX/rewardPoints
 {
    "rewardPoints": 443.2
}
