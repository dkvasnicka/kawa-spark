(require KawaSpark)

(get "/test" (lambda (req resp) "Hello, world!"))
(get "/test2" (lambda (req resp) "Hello, world2!"))
