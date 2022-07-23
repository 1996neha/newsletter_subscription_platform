## Build a Newsletter Subscriptions Platform

Problem Statement:
You have come up with an idea to build a newsletter subscription platform. Users can subscribe to monthly newsletters on your platform. (Rest API)

We have 3 entities:

1. User: id, name,
2. Newsletter: id, category_id, title, user_id, price
3. Category: id, name

- Register user API:

Allow users to register on the platform. They should be able to register on the platform using their name and email.

Sample request: { "name": "John Doe", "email": "john.doe@wonderfulemail.com" }
Sample response: { "user_id": 1 }


- Get newsletters API:

Any user should be able to query the newsletters on this platform using categories.

Sample request: { "categories" : [ "science", "technology"] }
Sample response:
{"newsletters":[{"science":[{"newsletter_id":1,"title":"Latest in tech by John Doe"},{"newsletter_id":2,"title":"Old in science by John Doe"}]},{"technology":[{"newsletter_id":1,"title":"Latest in tech by John Doe"}]}]}
{
"newsletters": [
{
"science": [
{
"newsletter_id": 1,
"title": "Latest in tech by John Doe"
},
{
"newsletter_id": 2,
"title": "Old in science by John Doe"
}
]
},
{
"technology": [
{
"newsletter_id": 1,
"title": "Latest in tech by John Doe"
}
]
}
]
}



