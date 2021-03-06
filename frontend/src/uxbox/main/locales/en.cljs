;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at http://mozilla.org/MPL/2.0/.
;;
;; Copyright (c) 2015-2016 Andrey Antukh <niwi@niwi.nz>
;; Copyright (c) 2015-2016 Juan de la Cruz <delacruzgarciajuan@gmail.com>

(ns uxbox.main.locales.en)

(defonce locales
  {"ds.projects" "PROJECTS"
   "ds.num-projects" ["No projects"
                      "%s project"
                      "%s projects"]
   "ds.num-colors" ["No colors"
                    "%s color"
                    "%s colors"]
   "ds.num-images" ["No images"
                    "%s image"
                    "%s images"]
   "ds.num-icons" ["No icons"
                   "%s icon"
                   "%s icons"]
   "ds.project-ordering" "Sort by"
   "ds.project-ordering.by-name" "name"
   "ds.project-ordering.by-last-update" "last update"
   "ds.project-ordering.by-creation-date" "creation date"
   "ds.project-search.placeholder" "Search..."

   "ds.elements" "ELEMENTS"
   "ds.icons" "ICONS"
   "ds.images" "IMAGES"
   "ds.colors" "COLORS"
   "ds.library-title" "Library: "
   "ds.standard-title" "STANDARD"
   "ds.your-libraries-title" "YOUR LIBRARIES"
   "ds.num-elements" ["%s element"
                      "%s elements"]

   "ds.recent-colors" "Recent colors"
   "ds.element-options" "Element options"
   "ds.draw-tools" "Draw tools"
   "ds.sitemap" "Sitemap"
   "ds.document-history" "Document history"

   "ds.help.rect" "Box (Ctrl + B)"
   "ds.help.circle" "Circle (Ctrl + E)"
   "ds.help.line" "Line (Ctrl + L)"

   "auth.message.recovery-token-sent" "Password recovery link sent to your inbox."
   "auth.message.password-recovered" "Password successfully recovered."

   "settings.profile" "PROFILE"
   "settings.password" "PASSWORD"
   "settings.notifications" "NOTIFICATIONS"
   "settings.profile-saved" "Profile saved successfully!"
   "settings.password-saved" "Password saved successfully!"

   "history.alert-message" "You are seeng version %s"
   "errors.api.form.old-password-not-match" "Incorrect old password"
   "errors.api.form.email-already-exists" "The email is already in use by other user."
   "errors.api.form.username-already-exists" "The username is already in use by other user."
   "errors.api.form.user-not-exists" "Username or email does not matches any existing user."
   "errors.form.required" "This field is mandatory"
   "errors.form.string" "Should be string"
   "errors.form.number" "Invalid number"
   "errors.form.integer" "Invalid integer"
   "errors.form.bool" "Should be bool"
   "errors.form.min-len" "Should be great than %s"
   "errors.form.max-len" "Should be less than %s"
   "errors.form.color" "Should be a valid color string"
   "errors.form.password-not-match" "Password does not match"
   "errors.auth.unauthorized" "Username or passwords seems to be wrong."
   "errors.auth.invalid-recovery-token" "The recovery token is invalid."
   "errors.profile.update-password" "Error updating password, probably your old password is wrong."

   "errors.network" "Unable to connect to backend server."
   "errors.generic" "Something work has happened."
   "errors.conflict" "Conflict on saving data, please refresh and try again."

   })
