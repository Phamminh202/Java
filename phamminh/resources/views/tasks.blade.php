<?php

?>
@extends('app');
@section('content')
    <div class="panel-body">
        @include('503')

        <form action="{{URL('task')}}" method="post" class="form-horizontal">
            {{csrf_token()}}
            <div class="form-group">
                <label for="task" class="col-sm-3 control-label">Task</label>
                <div class="col-sm-6">
                    <input type="text" name="name" id="task-name" class="form-control">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-6">
                    <button type="submit" class="btn btn-default">
                        <i class="fa fa-plus"></i>
                    </button>
                </div>
            </div>
        </form>
    </div>
