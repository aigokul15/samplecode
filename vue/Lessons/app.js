new Vue({
    el : '#demo',

    data : {
        name : 'GokulRaj'
    },

    ready : function(){
        var that = this;
        setInterval(function() {

            that.name = "Ready";

         },5000);
    }

});