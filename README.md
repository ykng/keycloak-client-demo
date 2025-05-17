# keycloak-demo

認証をKeyCloakに委譲したSpringBootのデモアプリケーション

## How to play

1. Keycloakのダウンロード・設定
2. 本アプリケーションの起動
3. 本アプリケーションのホームにアクセス

以下に、詳細な手順を示す

### 1. Keycloakのダウンロード・設定

[Keycloak](https://www.keycloak.org/)公式の[Getting Startedのページ（一例として本リンク先はOpenJDK用のもの）](https://www.keycloak.org/getting-started/getting-started-zip)を参考に
Keycloakのダウンロードおよび初期設定を行う

### 2. 本アプリケーションの起動

1.で設定したKeycloakの設定をapplication.propertiesに反映して起動する  
特に注意すべきは以下のポイント

- 同じローカルサーバでKeycloakと本アプリケーションを起動させる場合、ポートが被らないようにすること。具体的には、server.portで指定すること。
- client-secretの値を1.で設定したclientのページから参照できる個別の値に変えること
- provider.keycloak.~の各項目の値を1.で設定したKeyCloakのサーバIP、ポート、realm名に変えること

### 3. 本アプリケーションのホームにアクセス

ソースに手を加えていない場合、{baseURL}/homeでアクセスできる。  
※一例として、ローカルサーバで起動していた場合、http://localhost:8081/homeがアクセス先

## 動作確認バージョン

- Keycloak Server: 
  - Keycloak: keycloak-26.2.4
  - Java: openjdk version "23.0.1"

- Client Application:
  - Spring Boot: 3.4.5
  - Java: JDK21

## 参考
- [Spring Security](https://docs.spring.io/spring-security/reference/servlet/oauth2/login/core.html)
- [KeycloakとSpring Bootアプリを連携してみる](https://qiita.com/l_katayose/items/b922113bca354497f3cf)
  - 基本はこちらのサンプルコードを参照している
  - 主な変更点は以下
    - deprecatedメソッドの対応
    - 必要な依存関係（spring-boot-starter-oauth2-client）の追加
    - ymlファイルではなくpropertiesファイルでの環境変数管理