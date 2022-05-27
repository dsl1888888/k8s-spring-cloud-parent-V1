# 2021/6/8

# through ribbon / feign  request
http://localhost:26666/ribbon/service01/hello
http://localhost:26666/feign/service01/hello


# direct request
http://localhost:7002/service02/hello
http://localhost:7001/ask/mRestTemplate
http://localhost:7001/service01/hello

# through zuul request
http://localhost:26666/service01zuul/ask/mRestTemplate
http://localhost:26666/service01zuul/service01/hello
http://localhost:26666/service02zuul/service02/hello