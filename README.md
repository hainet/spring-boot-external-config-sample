# 外部コンフィグ読み込みの優先順位
## --spring.profiles.active=devの場合
1. classpath:application-dev.yml
1. config/application.yml
1. classpath:application.yml

プロファイルはdefaultとdevのレイヤがあって、そのレイヤ毎にconfig以下から順に読み込まれる。
