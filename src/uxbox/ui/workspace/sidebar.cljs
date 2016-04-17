;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at http://mozilla.org/MPL/2.0/.
;;
;; Copyright (c) 2015-2016 Andrey Antukh <niwi@niwi.nz>
;; Copyright (c) 2015-2016 Juan de la Cruz <delacruzgarciajuan@gmail.com>

(ns uxbox.ui.workspace.sidebar
  (:require [sablono.core :as html :refer-macros [html]]
            [rum.core :as rum]
            [lentes.core :as l]
            [uxbox.state :as st]
            [uxbox.router :as r]
            [uxbox.rstore :as rs]
            [uxbox.ui.mixins :as mx]
            [uxbox.ui.workspace.base :as wb]
            [uxbox.ui.workspace.sidebar.options :refer (options-toolbox)]
            [uxbox.ui.workspace.sidebar.layers :refer (layers-toolbox)]
            [uxbox.ui.workspace.sidebar.sitemap :refer (sitemap-toolbox)]
            [uxbox.ui.workspace.sidebar.history :refer (history-toolbox)]
            [uxbox.ui.workspace.sidebar.icons :refer (icons-toolbox)]
            [uxbox.ui.workspace.sidebar.drawtools :refer (draw-toolbox)]
            [uxbox.ui.workspace.sidebar.widgets :refer (widgets-toolbox)]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Left Sidebar
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn left-sidebar-render
  [own]
  (let [flags (rum/react wb/flags-l)]
    (html
     [:aside#settings-bar.settings-bar.settings-bar-left
      [:div.settings-bar-inside
       (when (contains? flags :sitemap)
         (sitemap-toolbox))
       (when (contains? flags :document-history)
         (history-toolbox))
       (when (contains? flags :layers)
         (layers-toolbox))]])))

(def left-sidebar
  (mx/component
   {:render left-sidebar-render
    :name "left-sidebar"
    :mixins [rum/reactive mx/static]}))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Right Sidebar
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn right-sidebar-render
  [own]
  (let [flags (rum/react wb/flags-l)]
    (html
     [:aside#settings-bar.settings-bar
      [:div.settings-bar-inside
       (when (contains? flags :drawtools)
         (draw-toolbox))
       (when (contains? flags :widgets)
         (widgets-toolbox))
       (when (contains? flags :element-options)
         (options-toolbox))
       (when (contains? flags :icons)
         (icons-toolbox))]])))

(def right-sidebar
  (mx/component
   {:render right-sidebar-render
    :name "right-sidebar"
    :mixins [rum/reactive mx/static]}))
