(defproject todo-list "0.1.0-SNAPSHOT"
  :description "A simple Webapp using Ring"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.4.0"]
                 [compojure "1.5.0"]]                                 ;;Vector of vector of dependencies
  :main todo-list.core
  :min-lein-version "2.0.0"
  :uberjar-name "todo-list.jar"
  :profiles {:dev
             {:main todo-list.core/-dev-main}})
