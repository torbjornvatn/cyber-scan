(ns cyber-scan.core)

(enable-console-print!)

(set! (. (.getElementById js/document (name "hepp")) -innerHTML) "hopp")
