(ns exercise3)

(defn fibonacci
  "Calcula el valor en la posicion x de la secuencia de Fibonacci"
  [x]
  (if (<= x 1) x (+ (fibonacci (- x 1)) (fibonacci (- x 2))))
)

