## Как запустить из терминала

#### Локально:

- <code><strong>gradle clean test --tests WebTest -Denv=local</strong></code>

#### Удаленно:

- <code><strong>gradle clean test --tests WebTest -Denv=remote</strong></code>

#### API:

- <code><strong>gradle clean test --tests ApiTest -DbaseUrl= -Dtoken=</strong></code>
- <code><strong>gradle clean test --tests ApiTest</strong></code>