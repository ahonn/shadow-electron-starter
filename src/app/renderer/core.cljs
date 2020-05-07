(ns app.renderer.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(defonce state (atom 0))

(defn root-component []
  [:div
   [:div.logos
    [:img.electron {:src "img/electron-logo.png"}]
    [:img.cljs {:src "img/cljs-logo.svg"}]
    [:img.reagent {:src "img/reagent-logo.png"}]]
   [:button
    {:on-click #(swap! state inc)}
    (str "Clicked " @state " times")]])

(defn start! []
  (reagent/render
    [root-component]
    (js/document.getElementById "app-container")))
