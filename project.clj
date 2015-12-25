(defproject leancloud.data.json "0.1.0-RC2"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :jvm-opts ["-Xmx1g" "-server" "-XX:MaxPermSize=256m" "-XX:+UseConcMarkSweepGC" "-XX:+UseCMSCompactAtFullCollection" "-Dclojure.compiler.elide-meta='[:doc :added]'"]
  :profiles {:dev {:dependencies [[criterium "0.4.3"]
                                  [clj-tuple "0.1.6"]
                                  [org.clojure/data.json "0.2.5"]]}})
