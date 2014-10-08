(ns guestbook.views.layout
  (:require [hiccup.page :refer [html5 include-css include-js]]))

(defn common [& body]
  (html5
    [:head
     [:title "Welcome to guestbook"]
     (include-css "/css/screen.css")]
     (include-js "//code.jquery.com/jquery-1.10.1.min.js" "/js/uielements.js")
    [:body body]))
