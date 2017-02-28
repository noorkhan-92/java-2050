(require '[clojure.string :as str])

(defn last-word
  [s]
  (let [sv (clojure.string/split s #" ")]
    (nth sv (- (count sv) 1))))

(let [x (str/split "a b c" #" ")] (nth x (- (count x) 1)))
