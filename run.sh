mvn clean install
 nohup mvn -e exec:java -Dexec.mainClass="org.aksw.dice.main.TimeEvaluation" -Dexec.args="-f ../dataset/airports.nt -t hare"  > /tmp/hare.log 2>&1 &
 taskset -cp 0,32,31,63
