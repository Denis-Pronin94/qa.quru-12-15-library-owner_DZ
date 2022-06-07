## Как запустить из терминала

#### Локально:

- <code><strong>gradle clean test --tests WebTest -Denv=local</strong></code>

#### Удаленно:

- <code><strong>gradle clean test --tests WebTest -Denv=remote</strong></code>

#### API:

- <code><strong>gradle clean test --tests ApiTest -DbaseUrl=https://github.com -Dtoken=123</strong></code>
- <code><strong>gradle clean test --tests ApiTest</strong></code>