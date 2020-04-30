# Spring H2 playing

This small project just remind me how to setup the h2 console.

Steps to enable it:

- Add the dependencies h2, jpa and web (required to don't shut down the context)
- Changing the `application.yml` with the correct values;
- Creating a entity, repository and controller

## How to access the h2 console

1) Access the url: http://localhost:8080/h2-console/
2) In the field `JDBC URL` insert the url as the property `spring.datasource.url`
3) The other values are the defaults
