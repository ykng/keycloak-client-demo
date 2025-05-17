# keycloak-demo

認証をKeyCloakに委譲したSpringBootのデモアプリケーション

## 参考
- [Spring Security](https://docs.spring.io/spring-security/reference/servlet/oauth2/login/core.html)
- [KeycloakとSpring Bootアプリを連携してみる](https://qiita.com/l_katayose/items/b922113bca354497f3cf)
  - 基本はこちらのサンプルコードを参照している
  - 主な変更点は以下
    - deprecatedメソッドの対応
    - 必要な依存関係（spring-boot-starter-oauth2-client）の追加
    - ymlファイルではなくpropertiesファイルでの環境変数管理