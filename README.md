# Sample Spring security JWT authentication

To get access token:
```bash
export TOKEN=`curl -XPOST user:thisisapassword@localhost:8080/token`
```

Access a page:
```bash
curl -H "Authorization: Bearer $TOKEN" localhost:8080/hello && echo
```