class UrlMappings {

  static mappings = {
    "/messageAPI"(controller: "messageAPI") {
      action = [GET: "list", POST: "save"]
    }

    "/messageAPI/$id"(controller: "messageAPI") {
      action = [GET: "show", PUT: "update", DELETE: "delete"]

      constraints { id(matches: /\d+/) }
    }

    "/threadAPI"(controller: "threadAPI") {
      action = [GET: "list", POST: "save"]
    }

    "/threadAPI/$id"(controller: "threadAPI") {
      action = [GET: "show", PUT: "update", DELETE: "delete"]

      constraints { id(matches: /\d+/) }
    }

    "/$controller/$action?/$id?"{ constraints {
        // apply constraints here
      } }

    "/"(view:"/index")
    "500"(view:'/error')
  }
}
