# Java-SpringBoot-filter-order
Java SpringBoot Filter Order

## Explanation
This repo contains examples of 3 different ways how to set order of filters in Spring:

- `DoNothingFilter` is instantiated via `FilterRegistrationBean` which is placed inside `MyAppConfiguration`. It has `HIGHEST_PRECEDENCE` which is equivalent of `Integer.MIN_VALUE` therefore it goes first.
- `MyCustomHeaderFilter` goes after `DoNothingFilter` since its order is set to `HIGHEST_PRECEDENCE + 1` value. It uses `@Order` annotation to set the order value.
- `HeadersLoggingFilter` goes last since its order set to `LOWEST_PRECEDENCE`. This example uses `Ordered` interface.


## Testing locally

- Run the application
- Send `GET` request to root path:
  - httpie: `http :8080`
  - curl: `curl http://localhost:8080`
- Observe logging