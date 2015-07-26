/**
 * Created by Roma on 18 Jul 2015.
 */
$(document).ready(function () {

    $('.add-text-block').click(function (e) {
        e.preventDefault();
        $('#newArticle').find('ul').append('' +
            '<li>' +
                '<div class="boxShadow">' +
                    '<textarea name="contentBlocks"></textarea>' +
                '</div>' +
            '</li>');
    });

});