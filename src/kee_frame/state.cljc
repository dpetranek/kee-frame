(ns ^:no-doc kee-frame.state)

(def controllers (atom {}))

(def router (atom nil))

(def navigator (atom nil))

(def app-db-spec (atom nil))

(def debug? (atom false))

(def breakpoints-initialized? (atom false))

;; Test utility
(defn reset-state! []
  (reset! controllers {})
  (reset! router nil)
  (reset! navigator nil))