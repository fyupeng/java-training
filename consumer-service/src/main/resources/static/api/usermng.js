const baseUrl= 'http://localhost:8081'
const usermng = {
  list: baseUrl + '/user/findAll',
  add: baseUrl + '/user/add',
  update: baseUrl + '/user/update',
  delete: baseUrl + '/user/delete',
  getUserList: function() {
    return new Promise((resolve, reject) => {
      $.ajax({
        type: "get",
        dataType: 'json',
        // jsonp:'jsoncallback',
        crossDomain: true,
        url: usermng.list,
        success: function (data) {
          // console.log(data);
          resolve(data)
        },
        error: function (xhr, errorMessage, e) {
          console.log("系统异常！" + e);
          reject(e)
        },
      });
    })
  },

  addUser: function(parameter) {
    return new Promise((resolve, reject) => {
      $.ajax({
        type: "post",
        // dataType: 'jsonp',
        dataType: "json",
        headers:{'Content-Type':'application/json;charset=utf8'},
        data: JSON.stringify(parameter),
        // jsonp:'jsoncallback',
        crossDomain: true,
        url: usermng.add,
        success: function (data) {
          // console.log(data);
          resolve(data)
        },
        error: function (xhr, errorMessage, e) {
          console.log("系统异常！" + e);
          reject(e)
        },
      });
    })
  },

  updateUser: function(parameter) {
    return new Promise((resolve, reject) => {
      $.ajax({
        type: "post",
        dataType: "json",
        headers:{'Content-Type':'application/json;charset=utf8'},
        data: JSON.stringify(parameter),
        // jsonp:'jsoncallback',
        crossDomain: true,
        url: usermng.update,
        success: function (data) {
          // console.log(data);
          resolve(data)
        },
        error: function (xhr, errorMessage, e) {
          console.log("系统异常！" + e);
          reject(e)
        },
      });
    })
  },

  deleteUser: function(parameter) {
    return new Promise((resolve, reject) => {
      $.ajax({
        type: "get",
        // dataType: 'jsonp',
        // data: parameter,
        // jsonp:'jsoncallback',
        crossDomain: true,
        url: usermng.delete + "/" + parameter,
        success: function (data) {
          // console.log(data);
          resolve(data)
        },
        error: function (xhr, errorMessage, e) {
          console.log("系统异常！" + e);
          reject(e)
        },
      });
    })
  }




}
