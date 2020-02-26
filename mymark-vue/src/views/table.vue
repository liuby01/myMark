<template>
    <div class="app-container">
        <el-table
                v-loading="listLoading"
                :data="list"
                element-loading-text="Loading"
                border
                fit
                highlight-current-row
        >

            <el-table-column align="center" label="课程号" width="95">
                <template slot-scope="scope">
                    {{ scope.$index }}
                </template>
            </el-table-column>

            <el-table-column label="课程名">
                <template slot-scope="scope">
                    {{ scope.row.title }}
                </template>
            </el-table-column>

            <el-table-column label="教师名" width="110" align="center">
                <template slot-scope="scope">
                    <span>{{ scope.row.author }}</span>
                </template>
            </el-table-column>

        </el-table>
    </div>
</template>

<script>
    export default {
        name: "table"
    }
</script>

<style scoped>

</style>
