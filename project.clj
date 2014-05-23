(defproject cyber-scan "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [compojure "1.1.8"]]


  :plugins [[lein-cljsbuild "1.0.2"]
            [lein-ring "0.8.10"]]

  :ring {:handler cyber-scan.handlers/app
         :auto-refresh? true
         :reload-paths ["src" "public"]}

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "cyber-scan"
              :source-paths ["src"]
              :compiler {
                :output-to "cyber_scan.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
