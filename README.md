# Rabbitmq Example

This is a project dedicated for showing Rabbitmq.



## Installing

After checking out the git repo run the following maven command

```bash
mvn clean install
```

This should install all packages, run all unit tests

## Starting

To start the server please run the following maven command

```bash
mvn spring-boot:run
```


## Testing

To execute the unit tests against the business logic service classes please run the following maven command

```bash
mvn test
```



## Using

### API Endpoint

* Http Method - **POST**
* Endpoint - **localhost:8080/order/{restaurantName}**



``` json
{
    "name": "chicken root",
    "qty" : 1,
    "price" : 15.15
}
```

Consumer:

```text
Message received from queue: OrderStatus(order=Order(orderId=06f8602a-26da-43d9-977a-4b328cdb6043, name=chicken root, qty=1, price=15.15), status=PROCESS, message=order placed successfully incafa)

```
