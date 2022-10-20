#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cstring>
#include <map>
#include <cmath>
#include <conio.h>
typedef long long ll;
using namespace std;
class Solution
{
public:
    int count = 0;
    int n, m;
    int numIslands(vector<vector<char>> &grid)
    {
        n = grid.size();
        m = grid[0].size();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (grid[i][j] == '1')
                {
                    populate(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    void populate(vector<vector<char>> &grid, int i, int j)
    {
        grid[i][j]= '2';
        if (j - 1 >= 0)
        {
            if (grid[i][j-1] == '1')
            {
                populate(grid,i,j-1);
            }
        }
        if (j + 1 < m)
        {
            if (grid[i][j + 1] == '1')
            {
                populate(grid,i,j+1);
            }
        }
        if (i - 1 >= 0)
        {
            if (grid[i - 1][j] == '1')
            {
                populate(grid,i-1,j);
            }
        }
        if (i + 1 < n)
        {
            if (grid[i + 1][j] == '1')
            {
                populate(grid,i+1,j);
            }
        }
        return;
    }
};
int main()
{
    getch();
}