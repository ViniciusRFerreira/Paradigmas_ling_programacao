(println "Digite o numero da tabuada:")
(def number (Integer/parseInt (read-line)))

(loop [i 1]
  (when (<= i 10)
    (println number "x" i "=" (* number i))
    (recur (inc i))))

;   A vaga escolhida foi Cloud Engineer – Pyrecast, da empresa Spatial Informatics Group (Dublin, Irlanda), 
; com salário de €70.000, em regime 100% remoto. Entre os requisitos, a vaga cita explicitamente 
; experiência em Clojure/ClojureScript ou outro dialeto de Lisp, além de valorizar conhecimento 
; em programação funcional — funções puras, imutabilidade, closures, lazy evaluation e 
; composição de funções. Isso reflete diretamente o paradigma da linguagem Clojure, que é 
; funcional (com imutabilidade por padrão e funções como cidadãs de primeira classe) e um 
; dialeto de Lisp (homoicônico, com código representado como estrutura de dados). Na prática, 
; essas características aparecem em conceitos como loop/recur para iteração sem estado mutável, 
; e o uso de atom como exceção controlada quando é necessário estado mutável.
