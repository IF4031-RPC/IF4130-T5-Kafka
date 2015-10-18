=====================================================<br>
##*   IF4130 - PENGEMBANGAN APLIKASI TERDISTRIBUSI   *<br>
###*             13512052 - 13513601                 *<br>
###*                Try Ajitiono                     *<br>
###*        Akhmad Fakhoni Listiyan Dede             *<br>
=====================================================<br>

###REQUIREMENT:<br>
    - jopt-simple-3.2.jar <br>
    - kafka_2.11-0.8.2.2.jar <br>
    - kafka_2.11-0.8.2.2-javadoc.jar <br>
    - kafka_2.11-0.8.2.2-scaladoc.jar <br>
    - kafka_2.11-0.8.2.2-sources.jar <br>
    - kafka_2.11-0.8.2.2-test.jar <br>
    - kafka-clients-0.8.2.2.jar <br>
    - log4j-1.2.16.jar <br>
    - lz4-1.2.0.jar <br>
    - metrics-core-2.2.0.jar <br>
    - nblibraries.properties
    - scala-library-2.11.5.jar <br>
    - scala-parser-combinators_2.11-1.0.2.jar <br>
    - scala-xml_2.11-1.0.2.jar <br>
    - slf4j-api-1.7.6.jar <br>
    - slf4j-log4j12-1.6.1.jar <br>
    - snappy-java-1.1.1.7.jar <br>
    - zkclient-0.3.jar <br>
    - zookeeper-3.4.6.jar <br>
    - JDK 1.8<br>
    - Zookeeper server<br>
    - Kafka server<br>
    
###How to deploy<br>
    - Buka folder bin<br>
    - Jalankan client menggunakan perintah "java -jar IF4130-T5-Kafka.jar"<br>
    - Ulangi langkah sebelumnya sesuai keinginan hingga mencapai jumlah client yang diinginkan<br>
    - Gunakan /NICK <nama> untuk mengganti nama, apabila hanya /NICK, maka aplikasi akan
      meng-assign nick random<br>
    - Gunakan /JOIN <channel> untuk masuk ke dalam channel<br>
    - Gunakan /LEAVE <channel> untuk keluar dari dalam channel<br>
    - Gunakan /EXIT untuk keluar dari aplikasi<br>
    - Gunakan @<nama channel> <pesan> untuk mengirim pesan ke semua orang di dalam channel tersebut<br>

###screenshoot: <br>

**Initialize NICK**
![Initialize NICK](screenshoot/nick.png?raw=true "Initialize NICK")

**Join Channel**
![Join Channel](screenshoot/joinchannel.png?raw=true "Join Channel")

**Send ke Channel1**
![Sending message](screenshoot/sendchannel1.png?raw=true "Send Channel1")

**Send ke Channel2**
![Sending message](screenshoot/sendchannel2.png?raw=true "Send Channel2")

**Send ke Channel1 dengan satu anggotanya sudah leave channel**
![Sending message](screenshoot/channel1leavesend.png?raw=true "Send Channel1 sendiri")

**Exit**
![Sending message](screenshoot/exit.png?raw=true "Exit")
