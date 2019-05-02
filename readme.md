# Auth Demo App

This app can be used for testing against various types of auth.

- Simple Auth (No Authentication)
- Basic Auth
- OAuth2
- SSL

## Simple (No) Auth

1. Set profile
    ```
    SPRING_PROFILES_ACTIVE=simple-auth
    ```

2. Run the app
3. Call any endpoint

## Basic Auth

1. Set profile
    ```
    SPRING_PROFILES_ACTIVE=basic-auth
    ```

2. Run the app
3. Call endpoints with Basic Auth Header
    ```bash
    curl -X POST \
      http://localhost:8080/api/users \
      -H 'Authorization: Basic YWRtaW46cGFzc3dvcmQ='
    ```

## OAuth2

1. Set profile
    ```
    SPRING_PROFILES_ACTIVE=oauth2
    ```

2. Run the app
3. Create Token
    ```bash
    curl -X POST \
      http://localhost:8080/oauth/token \
      -H 'Content-Type: application/x-www-form-urlencoded' \
      -H 'Authorization: Basic a2MtY2xpZW50OmtjLXNlY3JldA==' \
      -d 'grant_type=client_credentials&scope=any'
    ```
4. Use Token (substitute `{token}` with value from previous step)
    ````
    curl -X GET \
        http://localhost:8080/api/users \
        -H 'Authorization: Bearer {token}'
    ```