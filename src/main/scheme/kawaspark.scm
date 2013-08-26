(require KawaSpark)
(define-alias r spark.Request)

(get "/test" (lambda (req resp) "Hello, world!"))

(get "/test/:name" 
     (lambda (req resp) 
         (string-append "Hello, " 
                        (r:params req "name") "!")))
