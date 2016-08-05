nil (do (set! *warn-on-reflection* nil) (do nil (try (clojure.core/require (quote clojure.tools.nrepl.server)) (catch java.lang.Throwable t__11738__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote clojure.tools.nrepl.server) ":") (clojure.core/or (.getMessage t__11738__auto__) (clojure.core/type t__11738__auto__))))) (try (clojure.core/require (quote complete.core)) (catch java.lang.Throwable t__11738__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote complete.core) ":") (clojure.core/or (.getMessage t__11738__auto__) (clojure.core/type t__11738__auto__))))) nil) (do (clojure.core/when (try (java.lang.Class/forName "sun.misc.Signal") (catch java.lang.ClassNotFoundException e__11730__auto__)) (try (sun.misc.Signal/handle (sun.misc.Signal. "INT") (clojure.core/proxy [sun.misc.SignalHandler] [] (leiningen.repl/handle [signal__11731__auto__]))) (catch java.lang.Throwable e__11730__auto__))) (clojure.core/let [server__11733__auto__ (clojure.tools.nrepl.server/start-server :bind "127.0.0.1" :port 0 :ack-port 60711 :handler (clojure.tools.nrepl.server/default-handler)) port__11734__auto__ (:port server__11733__auto__) repl-port-file__11735__auto__ (clojure.core/apply clojure.java.io/file ["/git/github/iapetos" ".nrepl-port"]) legacy-repl-port__11736__auto__ (if (.exists (clojure.java.io/file "/git/github/iapetos/target")) (clojure.java.io/file "/git/github/iapetos/target" "repl-port"))] (clojure.core/when false (clojure.core/println "nREPL server started on port" port__11734__auto__ "on host" "127.0.0.1" (clojure.core/str "- nrepl://" "127.0.0.1" ":" port__11734__auto__))) (clojure.core/spit (clojure.core/doto repl-port-file__11735__auto__ .deleteOnExit) port__11734__auto__) (clojure.core/when legacy-repl-port__11736__auto__ (clojure.core/spit (clojure.core/doto legacy-repl-port__11736__auto__ .deleteOnExit) port__11734__auto__)) (clojure.core/deref (clojure.core/promise)))))