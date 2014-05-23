(ns cyber-scan.handlers
  (:use ring.util.response
        ring.middleware.params
        ring.middleware.multipart-params))

(defn index [request]
  (-> (file-response "index.html" {:root "src/public"})
      (content-type "text/html")))

(defn upload [{body :body}]
  (prn body))

(def app
  (-> index
      wrap-multipart-params))
