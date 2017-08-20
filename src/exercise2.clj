(ns exercise2)

(defn only-greater-than-five
  "Filtra de la colección los valores menores o iguales a 5"
  [col]
  (filter #(> % 5) col)
)



