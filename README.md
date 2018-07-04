# Monolith Restaurant Service

We are having a service which can print the total order value for the items selected.

## Running

#### Request
```
POST http://localhost:9000/orders/type/takeaway
header: Content-Type:application/json

[
	{
		"itemId": 1001,
		"quantity": 2
	},
	{
		"itemId": 1003,
		"quantity": 1
	}
]
```

#### Response
```
{
    "lineItems": [
        {
            "itemId": 1001,
            "name": "Mutton Biriyani",
            "price": 220,
            "quantity": 2,
            "total": 440
        },
        {
            "itemId": 1003,
            "name": "Galauti Kabab",
            "price": 230,
            "quantity": 1,
            "total": 230
        }
    ],
    "total": 670
}
```
